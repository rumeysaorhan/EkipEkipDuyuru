import { TestBed } from '@angular/core/testing';

import { EkipduyuruService } from './ekipduyuru.service';

describe('EkipDuyuruService', () => {
  let service: EkipduyuruService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(EkipduyuruService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
